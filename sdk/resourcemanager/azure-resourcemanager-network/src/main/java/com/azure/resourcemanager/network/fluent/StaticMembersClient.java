// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.StaticMemberInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in StaticMembersClient. */
public interface StaticMembersClient {
    /**
     * Gets the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<StaticMemberInner>> getWithResponseAsync(
        String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Gets the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<StaticMemberInner> getAsync(
        String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Gets the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StaticMemberInner get(
        String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Gets the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StaticMemberInner> getWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        String staticMemberName,
        Context context);

    /**
     * Creates or updates a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param parameters Parameters supplied to the specify the static member to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return staticMember Item along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<StaticMemberInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        String staticMemberName,
        StaticMemberInner parameters);

    /**
     * Creates or updates a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param parameters Parameters supplied to the specify the static member to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return staticMember Item on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<StaticMemberInner> createOrUpdateAsync(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        String staticMemberName,
        StaticMemberInner parameters);

    /**
     * Creates or updates a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param parameters Parameters supplied to the specify the static member to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return staticMember Item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StaticMemberInner createOrUpdate(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        String staticMemberName,
        StaticMemberInner parameters);

    /**
     * Creates or updates a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param parameters Parameters supplied to the specify the static member to create.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return staticMember Item along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StaticMemberInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        String staticMemberName,
        StaticMemberInner parameters,
        Context context);

    /**
     * Deletes a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Deletes a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(
        String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Deletes a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Deletes a static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        String staticMemberName,
        Context context);

    /**
     * Lists the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list StaticMember as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<StaticMemberInner> listAsync(
        String resourceGroupName, String networkManagerName, String networkGroupName, Integer top, String skipToken);

    /**
     * Lists the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list StaticMember as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<StaticMemberInner> listAsync(
        String resourceGroupName, String networkManagerName, String networkGroupName);

    /**
     * Lists the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list StaticMember as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StaticMemberInner> list(String resourceGroupName, String networkManagerName, String networkGroupName);

    /**
     * Lists the specified static member.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list StaticMember as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StaticMemberInner> list(
        String resourceGroupName,
        String networkManagerName,
        String networkGroupName,
        Integer top,
        String skipToken,
        Context context);
}
